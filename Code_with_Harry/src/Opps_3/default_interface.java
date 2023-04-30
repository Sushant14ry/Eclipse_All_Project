package Opps_3;

interface MyCamera{
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
interface MyWifi{
	String [] getNetworks();
	void connect_to_networks(String network);
}
class Mycellphone{
	void call_number(int phon_number) {
		System.out.println("Calling "+ phon_number);
	}
	void pick_call() {
		System.out.println("Calling....");
	}
}
class MySmart_Phone extends Mycellphone implements MyWifi,MyCamera{
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
public class default_interface {
	public static void main(String[] args) {
		MySmart_Phone ms = new MySmart_Phone();
		ms.record_4K_video();
		String[] arr = ms.getNetworks();
		for(String item : arr) {
			System.out.println(item);
		}
	}
}
