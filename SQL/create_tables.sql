create database cognizant;
use cognizant;
create table users(
	user_id int primary key auto_increment,
    full_name varchar(100) not null,
    email varchar(100) unique not null,
    city varchar(100) not null,
    registration_date date not null
    );
create table Events(
	event_id int primary key auto_increment,
    title varchar(200) not null,
    description text,
    city varchar(100) not null,
    start_date datetime not null,
    end_date datetime not null,
    status ENUM('upcoming','completed','cancelled'),
    organizer_id int,
    foreign key (organizer_id) references users(user_id)
    );
create table Sessions(
	session_id int primary key auto_increment,
    event_id int, 
    title varchar(200) not null,
    speaker_name varchar(100) not null,
    start_time datetime not null,
    end_time datetime not null,
    foreign key (event_id) references Events(event_id)
    );
create table Registrations(
	registration_id int primary key auto_increment,
    user_id int,
    event_id int,
    registration_date date not null,
    foreign key (user_id) references users(user_id),
    foreign key (event_id) references events(event_id)
    );
create table Feedback(
	feedback_id int primary key auto_increment,
    user_id int,
    event_id int,
    rating int check(rating between 1 and 5),
    comments text,
    feedback_date date not null,
    foreign key (user_id) references users(user_id),
    foreign key (event_id) references events(event_id)
    );
create table resources(
	resource_id int primary key auto_increment,
    event_id int,
    resource_type enum('pdf','image','link'),
    resource_url varchar(255) not null,
    uploaded_at datetime not null,
    foreign key (event_id) references events(event_id)
    );