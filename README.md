# LabAssignment3
Plugging Devices into Power Outlets

You are developing an application that helps users manage and control various electronic devices by plugging them into power outlets. 
Each device has different plug types, voltage, and amperage requirements. 
To ensure compatibility and safety, you need to create adapters for different devices to allow them to be plugged into standard power outlets.

<bold>Adaptee Objects:</bold>

<mark>Laptop</mark> - Represents a laptop device that needs to be plugged into a power source. It has the charge() method.

<mark>Refrigerator</mark> - Represents a refrigerator device that requires a power source. It has the startCooling() method.

<mark>SmartphoneCharger</mark> - Represents a smartphone charger that needs to be plugged in for charging. It has the chargePhone() method.

<bold>Target Object:</bold>

<mark>PowerOutlet</mark> - Represents a standard power outlet with a common interface for plugging in devices. It defines the plugIn() method as the target method.

<bold>Adapter Object:</bold>

<mark>LaptopAdapter</mark> - An adapter for plugging a laptop into a standard power outlet. It adapts the Laptop to the PowerOutlet interface, translating plugIn() to charge().

<mark>RefrigeratorAdapter</mark> - An adapter for plugging a refrigerator into a standard power outlet. It adapts the Refrigerator to the PowerOutlet interface, translating plugIn() to startCooling().

<mark>SmartphoneAdapter</mark> - An adapter for plugging a smartphone charger into a standard power outlet. It adapts the SmartphoneCharger to the PowerOutlet interface, translating plugIn() to chargePhone().
<br><br>In your solution you must provide the following in your Github link account:

  Problem statement (description of the problem. Just copy what is stated here.<br>
  UML Class Diagram<br>
  Uploaded java codes for the solution.<br>

  ![adapterpatternUML](https://github.com/user-attachments/assets/e160051b-1f44-44f8-83d1-e50bb63e437c)
