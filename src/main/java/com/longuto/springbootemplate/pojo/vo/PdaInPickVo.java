package com.longuto.springbootemplate.pojo.vo;

import com.longuto.springbootemplate.pojo.po.PdaInShelf;
import com.longuto.springbootemplate.pojo.po.PubPick;

import java.io.Serializable;

public class PdaInPickVo implements Serializable {

    public PdaInPickVo() {
    }

    public PdaInPickVo(PubPick pubPick, PdaInShelf pdaInShelf) {
        this.pubPick = pubPick;
        this.pdaInShelf = pdaInShelf;
    }

    private PubPick pubPick;

    private PdaInShelf pdaInShelf;

    public PubPick getPubPick() {
        return pubPick;
    }

    public void setPubPick(PubPick pubPick) {
        this.pubPick = pubPick;
    }

    public PdaInShelf getPdaInShelf() {
        return pdaInShelf;
    }

    public void setPdaInShelf(PdaInShelf pdaInShelf) {
        this.pdaInShelf = pdaInShelf;
    }
}
