package excel;

import java.io.File;

import java.io.IOException;

import jxl.Cell;

import jxl.Sheet;

import jxl.Workbook;

import jxl.read.biff.BiffException;

public class Test { // ���� �ҷ��ͼ� �б�

	public static void main(String[] args) throws BiffException, IOException { // ����ó��

		// ���� ���� �б�

		File f = new File("excel.xls");

		Workbook wb = Workbook.getWorkbook(f);

		Sheet sh = wb.getSheet(0);// ù��° ��Ʈ

		int rows = sh.getRows(); // ������ ��ü �� �˾Ƴ���

		// ���� ������ �ֱ⿡ for ���

		for (int i = 0; i < rows; i++) {// i<rows �۴ٶ�� ǥ���ؾ���

			Cell cell = sh.getCell(0, i);// (��,��)

			String con = cell.getContents();

			System.out.println(con);

			Cell cell2 = sh.getCell(1, i);// (��,��)

			String con2 = cell2.getContents();

			System.out.println(con2);

		}

	}

}