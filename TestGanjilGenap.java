package com.juaracoding.sqa;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)

public class TestGanjilGenap {
	TestGanjilGenap pengecekan;

	@Before
	public void setUp() throws Exception {
		pengecekan = new TestGanjilGenap();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	@FileParameters("src/test/resource/cekganjil.csv")
	public final void TestGanjilGenap(int angka, String hasil) {
		assertEquals(hasil, pengecekan.TestGanjilGenap(angka));
	}

	private Object TestGanjilGenap(int angka) {
		// TODO Auto-generated method stub
		return null;
	}

}
