package com.educandoweb.course.entities.enums;

public enum OrderStatus {
	WAITING_PAYMENT(1), PAID(2), SHIPPED(3), DELIVERED(4), CANCELED(5);

	private int cod;

	private OrderStatus(int cod) {
		this.cod = cod;
	}

	public int getCode() {
		return cod;
	}

	public static OrderStatus valueOff(int cod) {

		for (OrderStatus value : OrderStatus.values()) {

			if (value.getCode() == cod) {
				return value;
			}
		}

		throw new IllegalArgumentException("Invalid OrderStatus cod");

	}
}
