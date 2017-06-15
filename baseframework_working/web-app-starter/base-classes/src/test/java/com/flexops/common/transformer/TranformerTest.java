package com.flexops.common.transformer;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.flexops.common.config.BaseMessageTransformerConfig;
import com.flexops.common.transformer.JsonTransformer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { BaseMessageTransformerConfig.class })
public class TranformerTest {

	@Autowired
	Marshaller marshaller;

	@Autowired
	Unmarshaller unmarshaller;

	@Autowired
	JsonTransformer jsonTransformer;
	
	@Test
	public void testMarshaller() {
		Assert.assertNotNull(marshaller);
	}

	/*@Test
	public void testMarshallingAndUnmarshalling() throws Exception {
		String name = "John Doe";
		Person person = new Person();
		person.setName(name);
		FileOutputStream outputStream = new FileOutputStream(new File(
				"person.xml"));
		StreamResult xmlFileResult = new StreamResult(outputStream);

		marshaller.marshal(person, xmlFileResult);

		FileInputStream inputStream = new FileInputStream(
				new File("person.xml"));
		StreamSource xmlFileSource = new StreamSource(inputStream);
		Person unmarshaleldObject = (Person) unmarshaller
				.unmarshal(xmlFileSource);
		
		
		Assert.assertEquals(name, unmarshaleldObject.getName());
	}*/
	
	@Test
	public void testJsonTransformer(){
		String name = "John Doe";
		Person person = new Person();
		person.setName(name);
		String jsonString = jsonTransformer.toJson(person);
		
		Person fromJsonPerson = (Person)jsonTransformer.toObject(jsonString, Person.class);
		
		Assert.assertEquals(name, fromJsonPerson.getName());
	}
}
