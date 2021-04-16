package org.test.lomborktest;

//for logging into the other class log file
import org.apache.logging.log4j.Logger;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

//import lombok.extern.log4j.Log4j2;

//uses same class properties file
//@Log4j2

//@Getter
//@Setter
@NoArgsConstructor
@ToString(includeFieldNames = false)

public @Data class LomborkTest {

	private String prop1;
	private String prop2;

	//Setting propreties form caller class setter of lombork
	//getting logger from other class
	public void test(@NonNull Logger log1) {
		log1.info("In test() of LomborgTest");
		log1.debug("Printing from LomborkTest test()" + prop1 + " " + prop2 );
	}
	
	//executing the same class
//	public static void main(String[] args) {
//		LomborkTest l1= new LomborkTest();
//		l1.setProp1("nab");
//		l1.setProp2("hi");
//		log.info("Printing from LomborkTest main()" + l1.getProp1() + " " + l1.getProp2());
//	}

}
