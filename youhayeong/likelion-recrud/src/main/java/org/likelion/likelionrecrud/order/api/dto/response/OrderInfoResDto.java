package org.likelion.likelionrecrud.order.api.dto.response;

//주문 정보 응답 데이터
public record OrderInfoResDto(
        Long memberId,
        Long orderId,
        OrderItemResDto orderItems
) {

}
