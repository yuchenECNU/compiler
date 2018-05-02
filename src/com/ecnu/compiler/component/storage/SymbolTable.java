package com.ecnu.compiler.component.storage;

import com.ecnu.compiler.component.storage.domain.Symbol;

import java.util.ArrayList;
import java.util.List;

/**
 * 符号表
 *
 * @author Michael Chen
 * @date 2018-04-24 19:27
 */
public class SymbolTable {
    private List<Symbol> symbols;

    public SymbolTable() {
        this.symbols = new ArrayList<>();
    }


}
