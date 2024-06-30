package com.dspl.io.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.dspl.io.dao.PersistDao;
import com.dspl.io.entity.Employee;
import com.dspl.io.entity.Hobbies;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateEmployee
 */
@WebServlet("/update")
public class UpdateEmployee extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String gender = req.getParameter("gender");
		String[] hobbbies = req.getParameterValues("hobbies");
		String date = req.getParameter("dob");
		String designation = req.getParameter("designation");
		String address = req.getParameter("address");
		
		System.out.println("=================================");
		System.out.println(hobbbies.toString());
		System.out.println("=================================");

		List<Hobbies> hob = new ArrayList<Hobbies>();
		for (String h : hobbbies) {
			Hobbies h1 = new Hobbies();
			h1.setName(h);
			hob.add(h1);
		}
		
		Employee e = new Employee();
		e.setId(id);
		e.setName(name);
		e.setGender(gender);
		e.setHobbies(hob);
		e.setAddress(address);
		e.setDesignation(designation);
		e.setDate(date);
		
		PersistDao.updateEmployee(e);
		
		RequestDispatcher rd = req.getRequestDispatcher("display.jsp");
		rd.forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
