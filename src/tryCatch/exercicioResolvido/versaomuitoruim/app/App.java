package tryCatch.exercicioResolvido.versaomuitoruim.app;

import tryCatch.exercicioResolvido.versaomuitoruim.models.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Room number: ");
        int roomNumber = sc.nextInt();

        System.out.print("Check-in date (dd/MM/yyyy): ");
        Date checkIn = sdf.parse(sc.next());

        System.out.print("Check-out date (dd/MM/yyyy): ");
        Date checkOut = sdf.parse(sc.next());
        System.out.println();

        // Verificar se a data chekin é maior que a data checkout.
        if (!checkOut.after(checkIn)) {
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        } else {
            Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
            System.out.println();

            System.out.println("Enter data to update the reservation:");

            System.out.print("Room number: ");
            roomNumber = sc.nextInt();

            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());

            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());

            // Agora preciso tratar essa atualização para verificar se as datas não são futuras.
            Date now = new Date();
            if (checkIn.before(now) || checkOut.before(now)) { // Se minhas datas forem anterior(before)
                System.out.println("Error in reservation: Reservation dates for update must be future dates");
            }
            // Repetir a mesma logica pra verificar se a data checkin é maior que a data checkout.
            else if (!checkOut.after(checkIn)) {
                System.out.println("Error in reservation: Check-out date must be after check-in date");

            } else {
                reservation.updateDates(checkIn, checkOut);
                System.out.println("Reservation: " + reservation);
            }

        }

        sc.close();
    }
}
