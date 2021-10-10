package com.shz.barcode.generator;

import java.awt.image.BufferedImage;

public interface BarcodeGenerator {
	BufferedImage generateBarcode() throws Exception;
}
