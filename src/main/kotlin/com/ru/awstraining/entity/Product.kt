package com.ru.awstraining.entity

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "product")
open class Product(

    @Id
    @Column(name = "id", length = 36)
    open var id: String = UUID.randomUUID().toString(),

    @Column(name = "name", length = 100)
    open var name: String? = null,

    @Column(name = "description", length = 255)
    open var description: String? = null,
)

@Repository
interface ProductRepository : CrudRepository<Product, String>