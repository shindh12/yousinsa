# For Study

### Reference 
https://miro.com/app/board/o9J_l4TB7WA=/


## Use Case
### 상품 (Product)
1. 상품 목록을 조회한다 (ReadProductList)
2. 상품 상세 내용을 조회한다 (ReadProductDetail)
3. 상품 할인 정보를 조회한다 (ReadProductDiscount)

 -> ISSUE Naming : [UC-PRODUCT-1] 상품 목록 조회 로직 추가

### 좋아요 (Like)
1. 좋아요 수를 늘린다 (IncreaseLike)

### 주문정보 (OrderInfo)
1. 주문정보를 생성한다 (CreateOrderInfo)
2. 주문정보를 삭제(취소)한다 (DeleteOrderInfo)
3. 주문목록을 조회한다 (ReadOrderInfoList)
4. 주문상세를 조회한다 (ReadOrderInfo)
5. 주문정보를 변경한다 ()

### 배송 (Shipping)
1. 배송정보를 조회한다 (ReadShipping)

### 회원 (User)
1. 결제 수단을 조회한다 (ReadUserPayment)
2. 배송지 정보를 조회한다 (ReadUserShippingAddress)
3. 보유 쿠폰을 조회한다 (ReadUserCoupon)
4. 보유 포인트를 조회한다 (ReadUserPoint)

### External
1. 옵션 정보를 조회한다
   1. input : 상품 키
   2. output : 옵션 정보 (색상, 사이즈)
2. 재고를 조회한다
   1. input : 상품 키 
   2. output : 재고 수량

## Requirement
### 기능 목록
todo