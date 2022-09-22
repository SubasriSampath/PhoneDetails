package org.phone;

public class InternalStorage extends ExternalStorage{
private void processorName() {
	System.out.println("Processor Name is SNAPDRAGON 888 ");
}
private void ramSize() {
	System.out.println("Ram Size is 16GB");
}
private void phoneName() {
	System.out.println("Phone Name is Vivo");
}
public static void main(String[] args) {
	InternalStorage I = new InternalStorage();
	I.processorName();
	I.ramSize();
	I.size();
	I.phoneName();
}
}
