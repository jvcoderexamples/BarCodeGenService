package com.shz.barcode;

import com.shz.barcode.beans.BarcodeConfig;
import com.shz.barcode.bl.BarcodeService;
import com.shz.barcode.util.Constants;

import java.awt.image.BufferedImage;

public class BarCodeTester {
    public static void main(String[] args) throws Exception {
        BarcodeConfig barcodeConfig = new BarcodeConfig();
        barcodeConfig.setFormat(Constants.QR_CODE);
        barcodeConfig.setValue("1234567890");
        barcodeConfig.setWidth(400);
        barcodeConfig.setHeight(200);
        BarcodeService barcodeService = new BarcodeService();
        BufferedImage barcodeImage = barcodeService.generateBarcode(barcodeConfig);

        System.out.println(barcodeImage);
    }
}
