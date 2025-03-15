package CoreJavaPractices.src.smartwaste;

import java.util.Arrays;
import java.util.List;

public class SmartWasteApp {
    public static void main(String[] args) {
        SmartBin bin1 = new SmartBin(20);
        SmartBin bin2 = new SmartBin(30);

        try {
            bin1.fill(10);
            bin2.fill(30);
            bin1.fill(15); // This will throw an exception
        } catch (BinOverflowException e) {
            System.out.println(e.getMessage());
        }

        List <SmartBin> bins = Arrays.asList(bin1, bin2);
        GarbageTruck truck = new GarbageTruck(50);

        try {
            truck.collectWaste(bins);
        } catch (TruckOverloadException e) {
            System.out.println(e.getMessage());
        }

        EmailNotification emailService = new EmailNotification();
        SMSNotification smsService = new SMSNotification();

        emailService.send(new Notification("waste@city.com", "🚛 Waste collection complete."));
        smsService.send(new Notification("9876543210", "📢 Bin full! Collection scheduled."));
    }
}

