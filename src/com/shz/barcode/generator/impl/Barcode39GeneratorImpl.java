package com.shz.barcode.generator.impl;

import java.awt.image.BufferedImage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.oned.Code39Writer;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.shz.barcode.beans.BarcodeConfig;
import com.shz.barcode.generator.BarcodeGenerator;

public class Barcode39GeneratorImpl implements BarcodeGenerator {

	private BarcodeConfig settings;
	public Barcode39GeneratorImpl(BarcodeConfig barcodeConfig){
		this.settings = barcodeConfig;
	}
	
	public BufferedImage generateBarcode() throws Exception{
		BitMatrix bitMatrix = null;
		BufferedImage barcodeImage = null;
		
		bitMatrix = new Code39Writer().encode(settings.getValue(), BarcodeFormat.CODE_39, settings.getWidth(), settings.getHeight());

		if(null != bitMatrix){
			barcodeImage = MatrixToImageWriter.toBufferedImage(bitMatrix);
		}
		
		return barcodeImage;
	}
	
}
