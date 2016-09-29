package edu.osu.cse5234.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import beans.Item;
import beans.Order;
import beans.PaymentInfo;
import beans.ShippingInfo;

@Controller
@RequestMapping("/purchase")
public class Purchase {
	
	@RequestMapping(method = RequestMethod.GET)
	public String viewOrderEntryPage(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		Item watch = new Item("Watch", "10");
		Item necklace = new Item("Necklace", "10");
		Item[] items = new Item[2];
		items[0] = watch;
		items[1] = necklace;
		Order order = new Order(items);
		request.setAttribute("order", order);
		return "OrderEntryForm";
	}

	@RequestMapping(path = "/submitItems", method = RequestMethod.POST)
	public String submitItems(@ModelAttribute("order") Order order, HttpServletRequest request) {
		order.getItems()[0].setName("Watch");
		order.getItems()[1].setName("Necklace");
		request.getSession().setAttribute("order", order);
		return "redirect:/purchase/paymentEntry";
	}
	
	@RequestMapping(path = "/paymentEntry", method = RequestMethod.GET)
	public String viewPaymentEntryPage(HttpServletRequest request, HttpServletResponse response) {
		PaymentInfo paymentInfo = new PaymentInfo();
		paymentInfo.setCrediCardNumber("000-000");
		paymentInfo.setExpirationDate("00-00-0000");	 
		paymentInfo.setCvvCode("XXX");
		paymentInfo.setCardHolderName("BODONG");
		request.setAttribute("paymentInfo", paymentInfo);	
		return "PaymentEntryForm";
	}
	
	@RequestMapping(path = "/submitPayment", method = RequestMethod.POST)
	public String submitPayment(@ModelAttribute("paymentInfo") PaymentInfo paymentInfo,  HttpServletRequest request) {
		request.getSession().setAttribute("paymentInfo", paymentInfo);
		return "redirect:/purchase/shippingEntry";
	}
	
	@RequestMapping(path = "/shippingEntry", method = RequestMethod.GET)
	public String shippingEntry(HttpServletRequest request, HttpServletResponse response) {
		ShippingInfo shippingInfo = new ShippingInfo();
		shippingInfo.setAddressLine1("XIDIAN University");
		shippingInfo.setCity("XI'AN");
		shippingInfo.setState("SHAANXI");
		shippingInfo.setAddressLine2("China");	
		shippingInfo.setName("XIBONGQI");
		shippingInfo.setZip("101400");
		request.setAttribute("shippingInfo", shippingInfo);
		return "ShippingEntryForm";
	}
	
	@RequestMapping(path = "/submitShipping", method = RequestMethod.POST)
	public String submitPayment(@ModelAttribute("shippingInfo") ShippingInfo shippingInfo,  HttpServletRequest request) {
		request.getSession().setAttribute("shippingInfo", shippingInfo);
		return "redirect:/purchase/viewOrder";
	}
	
	@RequestMapping(path = "/viewOrder", method = RequestMethod.GET)
	public String viewOrder(HttpServletRequest request, HttpServletResponse response) {
		HttpSession httpSession =  request.getSession();
		
		ShippingInfo shippingInfo = (ShippingInfo)httpSession.getAttribute("shippingInfo");  
		request.setAttribute("shippingInfo", shippingInfo);
		
		PaymentInfo paymentInfo = (PaymentInfo)httpSession.getAttribute("paymentInfo");  
		request.setAttribute("paymentInfo", paymentInfo);
		
		Order order = (Order)httpSession.getAttribute("order");  
		request.setAttribute("order", order);
		return "ViewOrder";
	}
	
	@RequestMapping(path = "/confirmOrder", method = RequestMethod.POST)
	public String confirmOrder(@ModelAttribute("shippingInfo") ShippingInfo shippingInfo,  HttpServletRequest request) {
		//request.getSession().setAttribute("shippingInfo", shippingInfo);
		return "Greeting";
	}
	
	
	
}