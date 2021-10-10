package com.shz.barcode.generator.impl;

import java.awt.image.BufferedImage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.oned.Code128Writer;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.shz.barcode.beans.BarcodeConfig;
import com.shz.barcode.generator.BarcodeGenerator;

public class Barcode128GeneratorImpl implements BarcodeGenerator {

	private BarcodeConfig barcodeConfig;
	public Barcode128GeneratorImpl(BarcodeConfig barcodeConfig){
		this.barcodeConfig = barcodeConfig;
	}
	
	public BufferedImage generateBarcode() throws Exception{
		BitMatrix bitMatrix = null;
		BufferedImage barcodeImage = null;
		
		bitMatrix = new Code128Writer().encode(barcodeConfig.getValue(), BarcodeFormat.CODE_128, barcodeConfig.getWidth(), barcodeConfig.getHeight());

		if(null != bitMatrix){
			barcodeImage = MatrixToImageWriter.toBufferedImage(bitMatrix);
		}
		
		return barcodeImage;
	}
	
}
