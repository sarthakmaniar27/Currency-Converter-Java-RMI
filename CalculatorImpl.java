public class CalculatorImpl 
    extends 
      java.rmi.server.UnicastRemoteObject 
    implements Calculator { 
 
    // Implementations must have an 
    //explicit constructor 
    // in order to declare the 
    //RemoteException exception 
    public CalculatorImpl() 
        throws java.rmi.RemoteException { 
        super(); 
    } 
 
    public double con(double a, String b) 
        throws java.rmi.RemoteException { 

           
	switch(b){        
	case "Kuwait (KWD)":
                System.out.println("KWD to INR");
		return (double)Math.round(a * 241.13 * 10000d) / 10000d; 
	case "Bahrain (BHD)":
                System.out.println("BHD to INR");
		return (double)Math.round(a * 194.15 * 10000d) / 10000d; 
	case "Oman (OMR)":
                System.out.println("OMR to INR");
		return (double)Math.round(a * 190.13 * 10000d) / 10000d; 
	case "Jordan (JOD)":
                System.out.println("JOD to INR");
		return (double)Math.round(a * 103.16 * 10000d) / 10000d; 
	case "Gibraltar (GIP)":
                System.out.println("GIP to INR");
		return (double)Math.round(a * 95.07 * 10000d) / 10000d; 
    case "Great Britain (GBP)":
                System.out.println("GBP to INR");
        return (double)Math.round(a * 94.81 * 10000d) / 10000d;
    case "The Cayman Islands (KYD)":
                System.out.println("KYD to INR");
        return (double)Math.round(a * 87.84 * 10000d) / 10000d;
    case "The European Union (EUR)":
                System.out.println("EURO to INR");
        return (double)Math.round(a * 83.70 * 10000d) / 10000d;
    case "Switzerland (CHF)":
                System.out.println("CHF to INR");
        return (double)Math.round(a * 73.41 * 10000d) / 10000d;
    case "USA (USD)":
                System.out.println("USD to INR");
        return (double)Math.round(a * 73.18 * 10000d) / 10000d;                    
	default:
		break;
	}
	return 0;
    } 
 
} 

/*
AUD:- 55.64
ZAR:- 4.99
PKR:- 0.459
SAR:- 19.70
BRL:- 14.388
*/
