package main;

public class Program 
{
	public static void main(String[] args)
	{
		DeliveryTruck truck = new DeliveryTruck();
		int capacity = truck.getCapacityInSquareFeet();
		
		MailParcel parcel1 = new MailParcel(1.2, 3.5, 5.2, false);
		MailParcel parcel2 = new MailParcel(2.2, 1.1, 2.8, true);
		MailParcel parcel3 = new MailParcel(3.4, 4.8, 2.2, true);
		MailParcel parcel4 = new MailParcel(0.78, 1.0, 2.0, true);
		MailParcel parcel5 = new MailParcel(2, 10, 2, true);
		MailParcel parcel6 = new MailParcel(2.3, 4.2, 3.8, false);
		MailParcel parcel7 = new MailParcel(1.2, 2.2, 0.5, true);
		MailParcel parcel8 = new MailParcel(0.5, 8.8, 3.2, false);
		MailParcel parcel9 = new MailParcel(0.2, 0.25, 0.3, true);
		MailParcel parcel10 = new MailParcel(3.3, 0.12, 1.0, true);
		MailParcel parcel11 = new MailParcel(2.3, 3.12, 2.0, false);
		MailParcel parcel12 = new MailParcel(4.0, 4.12, 1.5, true);
		MailParcel parcel13 = new MailParcel(2.0, 2.3, 1.0, false);
		MailParcel parcel14 = new MailParcel(3.0, 3.33, 1.2, true);
		MailParcel parcel15 = new MailParcel(2.0, 7.0, 2.22, true);
		MailParcel parcel16 = new MailParcel(1.2, 3.5, 5.2, true);
		MailParcel parcel17 = new MailParcel(2.2, 1.1, 2.8, false);
		MailParcel parcel18 = new MailParcel(3.4, 4.8, 2.2, true);
		MailParcel parcel19 = new MailParcel(0.78, 1.0, 2.0, true);
		MailParcel parcel20 = new MailParcel(2, 10, 2, true);
		MailParcel parcel21 = new MailParcel(2.3, 4.2, 3.8, false);
		MailParcel parcel22 = new MailParcel(1.2, 2.2, 0.5, true);
		MailParcel parcel23 = new MailParcel(0.5, 8.8, 3.2, true);
		MailParcel parcel24 = new MailParcel(0.2, 0.25, 0.3, true);
		MailParcel parcel25 = new MailParcel(3.3, 0.12, 1.0, true);
		MailParcel parcel26 = new MailParcel(2.3, 3.12, 2.0, false);
		MailParcel parcel27 = new MailParcel(4.0, 4.12, 1.5, true);
		MailParcel parcel28 = new MailParcel(2.0, 2.3, 1.0, true);
		MailParcel parcel29 = new MailParcel(3.0, 3.33, 1.2, true);
		MailParcel parcel30 = new MailParcel(2.0, 7.0, 2.22, false);
	}
}