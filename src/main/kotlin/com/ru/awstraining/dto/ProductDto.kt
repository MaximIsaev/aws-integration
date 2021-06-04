package com.ru.awstraining.dto

import com.ru.awstraining.entity.Product

data class ProductDto(
    val name: String? = null,
    val description: String? = null,
) {
    constructor(entity: Product) : this(
        name = entity.name,
        description = entity.description
    )
}