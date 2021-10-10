package com.shz.barcode.generator.impl;

import java.awt.image.BufferedImage;

import com.shz.barcode.generator.BarcodeGenerator;
import org.jbarcode.JBarcode;
import org.jbarcode.JBarcodeFactory;

import com.shz.barcode.beans.BarcodeConfig;

public class Barcode93GeneratorImpl implements BarcodeGenerator {

	private BarcodeConfig barcodeConfig;

	public Barcode93GeneratorImpl(BarcodeConfig barcodeConfig) {
		this.barcodeConfig = barcodeConfig;
	}

	public BufferedImage generateBarcode() throws Exception {

		BufferedImage barcodeImage = null;

		JBarcodeFactory code = JBarcodeFactory.getInstance();
		JBarcode barcode = code.createCode93();
		barcode.setBarHeight(barcodeConfig.getHeight()/3.78);
		barcode.setXDimension(barcodeConfig.getWidth()/556.00);
		barcode.setShowText(false);
		barcodeImage = barcode.createBarcode(barcodeConfig.getValue());

		return barcodeImage;
	}

}
