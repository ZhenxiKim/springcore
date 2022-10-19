package com.example.springcore.order;

/**
 * @author jhkim
 * @since 2022-10-20
 *
 */
public interface OrderService {
	Order createOrder(Long memberId, String itemName, int itemPrice);
}
