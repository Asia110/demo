package com.example.demo.assembler;

import com.example.demo.assembler.PO.Product;
import com.example.demo.assembler.PO.ProductDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * @author chenyaguo
 * @date 2021/12/28 19:56
 */
@Mapper(componentModel = "spring")
public interface Assembler {

    @Mapping(source = "productName",target = "name")
    Product toDto(ProductDTO productDTO);
}
