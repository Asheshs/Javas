/**  this class demonstrates the use of object and methods inside a class
@author Ashesh
*/

class HelloWorldTwo{
    /*this method is used to print the message only..*/ 
    public int printMessage(String message){
        int lenngthOFMessage=message.length();
        return lenngthOFMessage;

    }
    public static void main(String...args){
        HelloWorldTwo hw =new HelloWorldTwo();
        int messageLength=hw.printMessage("My custom message");
        System.out.println("the message length is:" +messageLength);
    }
}