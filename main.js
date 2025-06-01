// Run when page loads
window.onload = () => {
  console.log("Welcome to the Community Portal");
  alert("Page Loaded!");

  const saved = localStorage.getItem('eventType');
  if (saved) {
    const eventTypeSelect = document.getElementById('eventType');
    if (eventTypeSelect) eventTypeSelect.value = saved;
  }
};

// Save preferred event type
function savePreference(sel) {
  localStorage.setItem('eventType', sel.value);
}

// Clear user preferences
function clearPreferences() {
  localStorage.clear();
  sessionStorage.clear();
  alert("Preferences cleared");
}

// Validate phone number
function validatePhone(el) {
  if (!/^\d{10}$/.test(el.value)) {
    alert("Invalid phone number! Must be 10 digits.");
  }
}

// Show event fee
function showFee(sel) {
  alert(`Fee for ${sel.value} is $10`);
}

// Show submit confirmation
function confirmSubmit() {
  alert("Feedback submitted!");
}

// Count characters in textarea
function countChars(el) {
  document.getElementById('charCount').textContent = el.value.length;
}

// Enlarge image on double click
function enlargeImage(img) {
  img.style.width = '300px';
  img.style.height = '300px';
}

// Reset image size on mouse leave
function resetImage(img) {
  img.style.width = '100px';
  img.style.height = '100px';
}

// Geolocation: Find nearby events
function findEvents() {
  navigator.geolocation.getCurrentPosition(
    (pos) => {
      document.getElementById('location').textContent =
        `Lat: ${pos.coords.latitude.toFixed(4)}, Lon: ${pos.coords.longitude.toFixed(4)}`;
    },
    (err) => {
      alert("Location error: " + err.message);
    },
    {
      enableHighAccuracy: true,
      timeout: 10000,
    }
  );
}

// Show confirmation message on registration
function confirmMsg() {
  const msg = document.getElementById('confirmationMsg');
  if (msg) {
    msg.style.visibility = "visible";
    setTimeout(() => {
      msg.style.visibility = "hidden";
    }, 3000);
  }
}

// Video message 
let alertShown = false;
function showMessage() {
  if (!alertShown) {
    alert("Video ready to play");
    alertShown = true;
  }
}

// Register a user s
function register() {
  const name = document.getElementById('name')?.value.trim();
  const email = document.getElementById('email')?.value.trim();
  const eventType = document.getElementById('eventType')?.value;
  const date = document.getElementById('date')?.value;

  if (!name || !email || !eventType || !date) {
    alert("Please fill out all required fields.");
    return;
  }

  const userData = {
    name,
    email,
    eventType,
    date
  };
  setTimeout(() => {
    fetch("https://jsonplaceholder.typicode.com/posts", {
      method: "POST",
      headers: {
        "Content-Type": "application/json"
      },
      body: JSON.stringify(userData)
    })
      .then((response) => {
        if (!response.ok) {
          throw new Error("Network response was not ok");
        }
        return response.json();
      })
      .then((data) => {
        alert("Registration successful!");
        console.log("Server Response:", data);
        confirmMsg();
      })
      .catch((error) => {
        alert("Failed to register. Please try again.");
        console.error("Registration Error:", error);
      });
  }, 2000); 
}

// Cancel registration
function cancelRegistration() {
  const form = document.getElementById('eventForm');
  if (form) form.reset();
  alert("Registration canceled.");
}

// Display upcoming events from mock data
function displayUpcomingEvents() {
  const events = [
    { name: "Music Night", date: "2025-06-15", seats: 12 },
    { name: "Art Workshop", date: "2025-06-10", seats: 0 },
    { name: "Community Sports Day", date: "2025-06-20", seats: 20 },
    { name: "Past Event", date: "2024-12-01", seats: 5 }
  ];

  const today = new Date().toISOString().split('T')[0];
  const tbody = document.getElementById('event-list');
  tbody.innerHTML = "";

  events.forEach(event => {
    try {
      if (event.date >= today && event.seats > 0) {
        const row = document.createElement('tr');
        row.innerHTML = `
          <td>${event.name}</td>
          <td>${event.date}</td>
          <td>${event.seats}</td>
        `;
        tbody.appendChild(row);
      }
    } catch (err) {
      console.error("Error displaying event:", err);
    }
  });
}
