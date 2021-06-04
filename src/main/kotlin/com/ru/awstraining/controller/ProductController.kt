package com.ru.awstraining.controller

import com.ru.awstraining.dto.ProductDto
import com.ru.awstraining.entity.Product
import com.ru.awstraining.entity.ProductRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(path = ["/product"])
class ProductController(
    private val productRepository: ProductRepository,
) {

    @PostMapping
    fun post(@RequestBody dto: ProductDto): ResponseEntity<Product> {
        val savedProduct = productRepository.save(Product(name = dto.name, description = dto.description))
        return ResponseEntity.ok(savedProduct)
    }

    @GetMapping(path = ["/{id}"])
    fun get(@PathVariable("id") id: String): ResponseEntity<Any> {
        val product = (productRepository.findByIdOrNull(id)
            ?: return ResponseEntity.notFound().build())

        return ResponseEntity.ok(product)
    }
}