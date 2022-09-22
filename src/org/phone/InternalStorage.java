package org.phone;

public class InternalStorage extends ExternalStorage{
private void processorName() {
	System.out.println("Processor Name is SNAPDRAGON 888 ");
}
private void ramSize() {
	System.out.println("Ram Size is 8GB");
}
public static void main(String[] args) {
	InternalStorage I = new InternalStorage();
	I.processorName();
	I.ramSize();
	I.size();
}
}
