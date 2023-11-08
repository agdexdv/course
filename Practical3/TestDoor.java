import java.util.Scanner;
class Door {  
   protected boolean isOpen = false;

   public void openDoor() {  
       if (isOpen == false) {  
           System.out.println("Door opened");  
           isOpen = true;
           return;  
       } else {  
           System.out.println("Door already open!");  
       }  
   }

   public void closeDoor() {  
       if (isOpen) {  
           System.out.println("Door closed");  
           isOpen = false;
           return;  
       } else {  
           System.out.println("Door already closed!");  
       }  
   }
}

class DoorWithLock extends Door {
    protected boolean isLocked = false;
    @Override
    public void openDoor() {
        if (!isOpen && isLocked) {
            System.out.println("Door is locked and cannot be opened!");
            return;
        } else {
            super.openDoor();
        }
    }

    public void lockDoor() {
        if (isOpen) {
            System.out.println("Open door cannot be locked!");
        } else if (isLocked) {
            System.out.println("Door already locked!");
        } else {
            System.out.println("Door locked");
            isLocked = true;
            return;
        }
   }
   public void unlockDoor() {
        if (isLocked) {
            System.out.println("Door is not locked");
        } else {
            System.out.println("Door unlocked");
            isLocked = false;
        }
   }
}

class DoorWithCodeLock extends DoorWithLock {
    protected int code = 0;

    @Override
    public void lockDoor() {
        if (isOpen) {
            System.out.println("Open door cannot be locked!");
        } else if (!isLocked) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the code to lock: ");
            code = input.nextInt();
            System.out.println("Now the door locked!");
            isLocked = true;
            return;
        } else {
            System.out.println("Door locked!");
        }
    }
    @Override
    public void unlockDoor() {
        if (isLocked == false) {
            System.out.println("Door is not locked");
        } else {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the code to unlock: ");
            int unlockCode = input.nextInt();
            if (unlockCode == code) {
                System.out.println("Door unlocked!");
                isLocked = false;
                return;
                } else {
                System.out.println("Invalid code!");
            }
        }
    }
}

public class TestDoor {
    public static void main(String[] args) {  
       DoorWithCodeLock door = new DoorWithCodeLock();
       
       while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("There are five options:");
            System.out.println("1. Open door");
            System.out.println("2. Close door");
            System.out.println("3. Lock door");
            System.out.println("4. Unlock door");
            System.out.println("5. Exit");
            System.out.println("Please enter your choice: ");
            int value = input.nextInt();

            switch (value) {
                case 1:
                    door.openDoor();
                    break;
                case 2:
                    door.closeDoor();
                    break;
                case 3:
                    door.lockDoor();
                    break;
                case 4:
                    door.unlockDoor();
                    break;
                case 5:
                    System.out.println("Exiting");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option!");
                    break;
            }
       } 
   }    
}