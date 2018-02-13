package ru.almaz.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrderDto {
    String id;
    String orderStatus;
}
