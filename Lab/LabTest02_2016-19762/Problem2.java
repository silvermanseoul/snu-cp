import java.io.IOException;
import java.security.interfaces.RSAMultiPrimePrivateCrtKey;
import java.util.Scanner;

public class Problem2 {
    final static boolean TEST = true;
    public static void main(String[] args) {
        if(TEST) {
            test();
        }
        else{
            sample();
        }
    }
    static void sample(){
        FlashDrive flash = new FlashDrive(10);
        Driver usbDriver = new USBDriver(flash);
        // Store
        usbDriver.save("Document",1);
        usbDriver.save(77.0,3);
        usbDriver.save(true,4);
        // Access
        System.out.println(usbDriver.access(3));
        System.out.println(usbDriver.access(1));
        System.out.println(usbDriver.access(4));
        // Overwrite
        usbDriver.save("Site",1);
        System.out.println(usbDriver.access(1));
        // Not stored
        System.out.println(usbDriver.access(5));
        // Delete
        usbDriver.save(null,4);
        System.out.println(usbDriver.access(4));
    }
    static void test(){
        String command, instruction, data; String[] parse;
        int index;
        Scanner input = new Scanner(System.in);
        FlashDrive flash = new FlashDrive(input.nextInt());
        Driver usbDriver = new USBDriver(flash);
        int iteration = input.nextInt();
        input.nextLine();
        if(iteration <= 0){ return; }
        for (int i = 0; i < iteration; i++) {
            command = input.nextLine();
            parse = command.trim().split("\\s+");
            instruction = parse[0];
            if(instruction.equals("s")){
                data = parse[1];
                index = Integer.parseInt(parse[2]);
                usbDriver.save(data,index);
            }
            else if (instruction.equals("a")){
                index = Integer.parseInt(parse[1]);
                System.out.println(usbDriver.access(index));
            }
            else{
                throw new IllegalArgumentException();
            }
        }
    }
}
interface Driver{
    public Object access(int index);
    public void save(Object o, int index);
}
class FlashDrive{
    private Object[] storage;
    private int capacity;
    FlashDrive(int capacity){
        if(capacity > 0){
            this.capacity = capacity;
            storage = new Object[this.capacity];
        }
        else{
            throw new IllegalArgumentException("USB Flash drive storage cannot be smaller than 0");
        }
    }
    public Object load(int index){
        driveStateCheck(index);
        return storage[index];
    }
    public void store(Object o, int index){
        driveStateCheck(index);
        storage[index] = o;
    }
    private void driveStateCheck(int index){
        if(!stateValid(index)){
            throw new IllegalArgumentException("Failed to Store");
        }
    }
    private boolean stateValid(int index){
        return  storage != null && index < capacity && index >= 0;
    }
}

class USBDriver implements Driver {
    private FlashDrive fd;
    USBDriver(FlashDrive flash) {
        this.fd = flash;
    }
    public Object access(int index) {
        Object obj = fd.load(index);
        return obj;
    };
    public void save(Object o, int index){
        fd.store(o, index);
    }
}