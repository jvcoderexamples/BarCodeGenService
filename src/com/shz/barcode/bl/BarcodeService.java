package com.shz.barcode.bl;

import com.shz.barcode.beans.BarcodeConfig;
import com.shz.barcode.factory.BarcodeFactory;
import com.shz.barcode.generator.BarcodeGenerator;

import java.awt.image.BufferedImage;

public class BarcodeService {

    public BufferedImage generateBarcode(BarcodeConfig barcodeConfig) throws Exception{
        BufferedImage barcodeImage = null;
        BarcodeGenerator barcodeGeneratorObj = BarcodeFactory.getInstance(barcodeConfig);
        barcodeImage = barcodeGeneratorObj.generateBarcode();
        return barcodeImage;
    }
}
