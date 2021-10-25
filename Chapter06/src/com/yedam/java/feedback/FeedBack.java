package com.yedam.java.feedback;

import java.util.Scanner;

public class FeedBack {

	public static void main(String[] args) {
	
		// 문제2) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서 
		//    최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
		// 1) 메뉴는 다음과 같이 구성하세요.
		//  1.상품 수 | 2.가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
		// 2) 입력한 상품 수만큼 가격을 입력받을 수 있도록 구현하세요.
		// 3) 제품별 가격을 출력 "상품명:가격"
		// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
		// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.
        Scanner sc = new Scanner(System.in);
        product[]products = null;
        //int [] price = null;
         int productNum = 0;
         boolean run = true;

    while (run) {
	System.out.println("1.상품수 |2.가격입력 |3.제품별가격 |4.분석 |5.종료 ");
	System.out.println("선택 > ");
	int selctnum=sc.nextInt();
	
	switch(selctnum) {
	
	case 1:
		System.out.println("상품수 > ");
		productNum =sc.nextInt();
		products = new product[productNum];
		break;
	case 2:
		
		for (int i=0 ; i< products.length ; i++){
			System.out.println("상품명 >");
			String name = sc.next();
			System.out.println("가격 >");
			int price = sc.nextInt();
			
			product product = new product(name,price);
			products[i] =  product;
			//products[i] = new product(name, price)
		}
		break;
	case 3:
		for (int i =0 ; i < products.length ; i++) {
		product product = products[i];
		System.out.printf("%s: %d: \n",product.getName(), product.getPrice());
		}
		break;
	case 4:
		int max = 0;
//		
//		for (int prices : price) {
//			if ( prices > max ) {
//				max = prices;
//			}
//		}
		int index =0;
		for(int i = 0; i <products.length ; i++) {
			product product = products[i];
			if(product.getPrice()>max) {
				max = product.getPrice();
				index = i;
			}
		}
		int sum = 0;
		for (product product : products) {
			if(product.getPrice()== max) {
				continue;
			}
			sum += product.getPrice();
		}
			
		
	
		product porudct = products[index];
		System.out.println("최고 가격을 가진 제품은" +porudct.getName()+"입니다.");
		System.out.println("최고 가격을 가진 제품은"+products[index].getName()+"입니다.");
		
		System.out.println("최고 가격을 제외한 제품들의 합은 "+sum+"입니다.");
		break;

	case 5:
		run = false;
		System.out.println("종료");
		break;
	
	}

	}
	}
}

