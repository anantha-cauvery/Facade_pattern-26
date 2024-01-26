public class Event_Organizer {
private final Guest_lecture guestlecture;
private final Seminar_eve seminar;
private EventManagement Guest_lecture;
private EventManagement Seminar_eve;
public Event_Organizer() {
guestlecture = new Guest_lecture();
seminar = new Seminar_eve();
}
public void Guest_lectureAccess() {
guestlecture.event_type();
guestlecture.event_enrollment();
}
public void Seminar_eveAccess() {
seminar.event_type();
seminar.event_enrollment();
}
