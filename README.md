# Calendar 📆

An easy to use reminder and task scheduling app to remind people of
 important things that need to be done throughout the day.
 
#### Installation

This app will be designed to work on Android, but it has not been ported yet.

#### Design

The calendar shows your personal schedule for the week to allow you to see
the outline of your schedule for the week in one glance. The app will
always show the schedule for today and the next 6 days from a dedicated
`Week` class by storing today's date and a queue of the next 6 `Day`s.
Each `Day` object will have a linked list of `Activity` objects, processed
as a queue, in chronological order. At the end of the current day, the
first `Day` object in the linked list, which represents the current day,
will be popped off the queue, with another `Day` being added to the back of
the queue to maintain the functionality where 7 `Day` objects are stored in
the `Week` object all the time. The `Week` object will also be the primary
mode of interaction between the backend side of the app and the user.
