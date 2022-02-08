package com.example.crmwork;

import com.example.crmwork.controls.EPC_Control;
import com.example.crmwork.domain.Clients;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.util.MultiValueMap;

import static org.assertj.core.api.Assertions.assertThat;

import static org.hamcrest.core.StringContains.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
class CrmWorkApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private EPC_Control controller;




	@Test
	public void contextLoads(){
		assertThat(controller).isNotNull();
	}

	@Test
	public void greetingShouldReturnDefaultMessage() throws Exception {
		this.mockMvc.perform(get("/epc/"))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(content().string(containsString("Hello, World")));
	}

	@Test
	public void createClient() throws Exception {
		Clients clients = new Clients();
		clients.setName("Alex");
		clients.setFamily("A");
		clients.setOth("Al");
		clients.setYear(2);
		clients.setSex("male");

		this.mockMvc.perform(post("/epc/client")
						.param("name", clients.getName())
						.param("family", clients.getFamily())
						.param("oth", clients.getOth())
//						.param("years", String.valueOf(clients.getYear()))
						.param("sex", clients.getSex()))
				.andDo(print())
				.andExpect(status().isOk());
	}
}
