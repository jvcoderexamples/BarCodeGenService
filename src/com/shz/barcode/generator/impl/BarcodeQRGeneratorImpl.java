package com.shz.barcode.generator.impl;

import java.awt.image.BufferedImage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.shz.barcode.beans.BarcodeConfig;
import com.shz.barcode.generator.BarcodeGenerator;

public class BarcodeQRGeneratorImpl implements BarcodeGenerator {
	
	private BarcodeConfig barcodeConfig;
	public BarcodeQRGeneratorImpl(BarcodeConfig barcodeConfig){
		this.barcodeConfig = barcodeConfig;
	}
	
	public BufferedImage generateBarcode() throws Exception{
		BitMatrix bitMatrix = null;
		BufferedImage barcodeImage = null;
		
		bitMatrix = new QRCodeWriter().encode(barcodeConfig.getValue(), BarcodeFormat.QR_CODE, barcodeConfig.getWidth(), barcodeConfig.getHeight());

		if(null != bitMatrix){
			barcodeImage = MatrixToImageWriter.toBufferedImage(bitMatrix);
		}
		
		return barcodeImage;
	}
	
}
