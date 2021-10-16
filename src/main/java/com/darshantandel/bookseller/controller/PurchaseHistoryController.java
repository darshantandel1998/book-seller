package com.darshantandel.bookseller.controller;

import com.darshantandel.bookseller.model.PurchaseHistory;
import com.darshantandel.bookseller.security.UserPrincipal;
import com.darshantandel.bookseller.service.IPurchaseHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/purchase-history")
public class PurchaseHistoryController {

    @Autowired
    private IPurchaseHistoryService purchaseHistoryService;

    @GetMapping
    public ResponseEntity<?> getAllPurchaseHistoryOfUser(@AuthenticationPrincipal UserPrincipal userPrincipal) {
        return new ResponseEntity<>(purchaseHistoryService.findIPurchaseItemOfUser(userPrincipal.getId()), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> savePurchaseHistory(@RequestBody PurchaseHistory purchaseHistory) {
        return new ResponseEntity<>(purchaseHistoryService.savePurchaseHistory(purchaseHistory), HttpStatus.CREATED);
    }
}
