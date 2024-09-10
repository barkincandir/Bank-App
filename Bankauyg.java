package öğrenme_1;

import java.util.Scanner;

public class Bankauyg {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("******Boris Bank'a Hoşgeldiniz.******");
		long tckn = 11111111111L;
		int sif = 222222;
		int para = 2000;
		int borc = 1500;
		long tcno;
		int ssifre;
		while (true) {
			int sayac = 0;
			int sayac2 = 0;
			while (true) {
				System.out.print("Tckn: ");
				long tc = scanner.nextLong();
				scanner.nextLine();
				System.out.print("Şifre: ");
				int sifre = scanner.nextInt();
				scanner.nextLine();
				long tc1 = tc;
				int sifre1 = sifre;
				while (tc1 > 0) {
					tc1 = tc1 / 10;
					sayac++;
				}
				if (sayac != 11) {
					System.out.print("Hatalı tc girişi. ");
					sayac = 0;
				}
				while (sifre1 > 0) {
					sifre1 = sifre1 / 10;
					sayac2++;
				}
				if (sayac2 != 6) {
					System.out.println("Hatalı sifre girişi.");
					sayac2 = 0;
				}
				if ((sayac == 11) && (sayac2 == 6)) {
					sayac = 0;
					sayac2 = 0;
					tcno = tc;
					ssifre = sifre;
					break;
				}
				System.out.println("          Tekrar deneyiniz.");
			}
			if ((tcno != tckn) || (ssifre != sif)) {
				System.out.println("Giriş başarılı.");
				break;
			}	
			  else {
				System.out.println("Giriş başarılı.");
				break;

			}

		}
		System.out.println("\n");
		System.out.println("İşlem yapacağınız kartı seçiniz.");
		System.out.println("1. Banka kartı " + "2. Kredi kartı");
		System.out.print("====>");
		int islem = scanner.nextInt();
		System.out.println("\n");
		if (islem == 1) {
			System.out.println("------Banka kartı------");
			System.out.println("\n");
			System.out.println("1. Hesap bilgileri " + "2. Para Yatırma " + "3. Para çekme");
			System.out.print("====>");
			int islem1 = scanner.nextInt();
			if (islem1 == 1) {
				System.out.println("Para miktarı: " + para);
			} else if (islem1 == 2) {
				System.out.println("Para miktarı: " + para);
				System.out.print("Yatırılacak tutarı giriniz: ");
				int yat = scanner.nextInt();
				if ((yat % 10) == 0) {
					para = para + yat;
					System.out.println("------İşlem başarılı.------");
					System.out.println("Para miktarı: " + para);
				} else {
					System.out.println("En düşük 10' luk banknot yatırabilirsiniz.");

				}
			} else if (islem1 == 3) {
				System.out.println("Para miktarı: " + para);
				System.out.print("Çekilecek tutarı giriniz: ");
				int cek = scanner.nextInt();
				if ((cek % 10) == 0) {
					if (cek <= para) {
						para = para - cek;
						System.out.println("------İşlem başarılı.------");
						System.out.println("Para miktarı: " + para);

					} else {
						System.out.println("Yetersiz bakiye.");
					}

				} else {
					System.out.println("En düşük 10' luk banknot çekebilirsiniz.");

				}
			} else {
				System.out.println("Hatalı tuşlama yaptınız.");
			}
		} else if (islem == 2) {
			System.out.println("------Kredi kartı------");
			System.out.println("\n");
			System.out.println("1. Borç bilgileri " + "2. Borç ödeme");
			System.out.print("====>");
			int islem2 = scanner.nextInt();
			if (islem2 == 1) {
				System.out.println("Güncel borcunuz: " + borc);
			} else if (islem2 == 2) {
				System.out.println("Para miktarı: " + para);
				System.out.println("Güncel borcunuz: " + borc);
				System.out.print("Ödenecek miktarı giriniz: ");
				int brc = scanner.nextInt();
				if (brc <= para) {
					if (brc <= borc) {
						para = para - brc;
						borc = borc - brc;
						System.out.println("------İşlem başarılı.------");
						System.out.println("Para miktarı: " + para);
						System.out.println("Güncel borcunuz: " + borc);

					} else {
						System.out.println("Borç miktarından fazla ödeme yapamazsınız.");

					}

				} else {
					System.out.println("Yetersiz bakiye.");

				}
			} else {
				System.out.println("Hatalı tuşlama yaptınız.");
			}

		} else {
			System.out.println("Hatalı tuşlama yaptınız.");
		}

	}
}
