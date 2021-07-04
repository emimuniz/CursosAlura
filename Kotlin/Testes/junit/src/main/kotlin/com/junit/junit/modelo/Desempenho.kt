package com.junit.junit.modelo

import java.math.BigDecimal

enum class Desempenho {
    A_DESEJAR {
        override fun percentualReajuste() = BigDecimal("0.03")
    },
    BOM {
        override fun percentualReajuste() = BigDecimal("0.15")
    },
    OTIMO {
        override fun percentualReajuste() = BigDecimal("0.2")
    };

    abstract fun percentualReajuste() : BigDecimal
}
