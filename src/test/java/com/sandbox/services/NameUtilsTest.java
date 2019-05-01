package com.sandbox.services;

import org.junit.Assert;
import org.junit.Test;

import com.sandbox.enums.Options;

public class NameUtilsTest {
	
	/* Test StringJoiner */
	@Test
	public void getName_WithStringJoiner_WhenPartialName() {
		Options o = Options.A1_B1_C1;
		String result = NameUtils.getNameWithStringJoiner(o);
		Assert.assertEquals("A1-B1-C1",result);
	}
	
	@Test
	public void getName_WithStringJoiner_WhenFullName() {
		Options o = Options.A1_B1_C1_D1_E1;
		String result = NameUtils.getNameWithStringJoiner(o);
		Assert.assertEquals("A1-B1-C1-D1-E1",result);
	}
	
	@Test
	public void getName_WithStringJoiner_WhenFullNameWithNulls() {
		Options o = Options.A2_D2;
		String result = NameUtils.getNameWithStringJoiner(o);
		Assert.assertEquals("A2-null-null-D2",result);
	}
	
	/* Test StringBuiler */
	@Test
	public void getName_WithStringBuilder_WhenPartialName() {
		Options o = Options.A1_B1_C1;
		String result = NameUtils.getNameWithStringBuilder(o);
		Assert.assertEquals("A1-B1-C1",result);
	}
	
	@Test
	public void getName_WithStringBuilder_WhenFullName() {
		Options o = Options.A1_B1_C1_D1_E1;
		String result = NameUtils.getNameWithStringBuilder(o);
		Assert.assertEquals("A1-B1-C1-D1-E1",result);
	}
	
	@Test
	public void getName_WithStringBuilder_WhenFullNameWithNulls() {
		Options o = Options.A2_D2;
		String result = NameUtils.getNameWithStringBuilder(o);
		Assert.assertEquals("A2-null-null-D2",result);
	}
	
	/* Test StringFormattor */
	@Test
	public void getName_WithStringFormattor_WhenPartialName() {
		Options o = Options.A1_B1_C1;
		String result = NameUtils.getNameWithStringFormattor(o);
		Assert.assertEquals("A1-B1-C1",result);
	}
	
	@Test
	public void getName_WithStringFormattor_WhenFullName() {
		Options o = Options.A1_B1_C1_D1_E1;
		String result = NameUtils.getNameWithStringFormattor(o);
		Assert.assertEquals("A1-B1-C1-D1-E1",result);
	}
	
	@Test
	public void getName_WithStringFormattor_WhenFullNameWithNulls() {
		Options o = Options.A2_D2;
		String result = NameUtils.getNameWithStringFormattor(o);
		Assert.assertEquals("A2-null-null-D2",result);
	}

}
