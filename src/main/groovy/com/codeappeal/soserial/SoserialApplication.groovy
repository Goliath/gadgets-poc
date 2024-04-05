package com.codeappeal.soserial

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SoserialApplication {

	static void main(String[] args) {
		SpringApplication.run(SoserialApplication, args)

		// Lets craft and persist the evil serialized gadget (here holding unix command) in place of a perfectly valid java object
		TroubleHelper.persistGadget("perfectly-valid-object.ser", "cat /etc/passwd")

		// Loading serialized harmful payload into perfectly valid object to see what happens...
		// Please notice how simple TroubleHelper.load method is - it just reads the object from file and casts it to PerfectlyValidObject
		PerfectlyValidObject perfectlyValidObject = TroubleHelper.load("perfectly-valid-object.ser")
	}

}
