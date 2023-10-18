public class Employee{
    private int hours;
    private double rate;

    public Employee (int hours,double rate){
         this.hours = hours;
         this.rate = rate;
    }
   
    public double pay() {
     double regularPay;
     double overtimePay;

     // Check if the employee worked more than 40 hours
     if (hours <= 40) {
         regularPay = hours * rate; // Regular pay for the first 40 hours
         overtimePay = 0;          // No overtime pay
     } else {
         regularPay = 40 * rate;                  // Regular pay for the first 40 hours
         overtimePay = (hours - 40) * rate * 1.5; // Overtime pay for hours over 40
     }

     // Calculate the total pay
     double totalPay = regularPay + overtimePay;
     return totalPay;
 }

    }

    
    