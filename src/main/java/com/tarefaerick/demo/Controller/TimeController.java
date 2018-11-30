//package com.tarefaerick.demo.Controller;
//
//import java.util.List;
//
//import static org.springframework.web.bind.annotation.RequestMethod.GET;
//import static org.springframework.web.bind.annotation.RequestMethod.POST;
//import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
//
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import br.com.erickds.dao.TimeDAO;
//import model.Time;
//
//@Controller
//
//public class TimeController {
//
//	@ResponseBody
//	@RequestMapping(value = "/times",method = GET, produces = "application/json")
//	public List<Time> getAll() {
//		TimeDAO dao = new TimeDAO();
//
//		return dao.getAll();
//	}
//
//	@ResponseBody
//	@RequestMapping(value = "/times",method = POST, produces = "application/json")
//	public ResponseEntity<?> add(@RequestBody Time country) {
//		System.out.println(country);
//		TimeDAO dao = new TimeDAO();
//		dao.insert(country);
//		return ResponseEntity.ok().build();
//	}
//
//	@ResponseBody
//	@RequestMapping(value = "/times/{id}",method = DELETE, produces = "application/json")
//	public ResponseEntity<?> deleteEmployee(@PathVariable Long id) {
//		TimeDAO dao = new TimeDAO();
//		try {
//			dao.deleteById(id);
//		}catch(Exception e) {
//			return ResponseEntity.notFound().build();
//		}
//		return ResponseEntity.ok().build();
//	}
//
//}
