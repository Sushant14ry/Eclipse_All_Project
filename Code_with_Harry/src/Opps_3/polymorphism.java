package Opps_3;

interface MyCamera2{
	void take_snap();
	void record_video();
	private void greet(){
		System.out.println("Good Morning");
	}
	default void record_4K_video() {
		greet();
		System.out.println("Recording 4K Video");
	}
}
interface MyWifi2{
	String [] getNetworks();
	void connect_to_networks(String network);
}
class Mycellphone2{
	void call_number(int phon_number) {
		System.out.println("Calling "+ phon_number);
	}
	void pick_call() {
		System.out.println("Calling....");
	}
}
class MySmart_Phone2 extends Mycellphone2 implements MyWifi2,MyCamera2{
	public void take_snap() {
		System.out.println("Taking Snap");
	}
	public void record_video() {
		System.out.println("Taking Vidio");
	}
	public String [] getNetworks() {
		System.out.println("Getting List of Networks");
		String[] network_list= {"Ncell","NTC","Smart"};
		return network_list;
	}
	public void connect_to_networks(String network) {
		System.out.println("Connecting to "+network);
	}
}
public class polymorphism {
	public static void main(String[] args) {
		MySmart_Phone2 s = new  MySmart_Phone2();
		s.getNetworks();		
		s.pick_call();       
		s.record_4K_video();
		s.call_number(982122423);
	}
}
