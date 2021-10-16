package com.darshantandel.bookseller.service;

import com.darshantandel.bookseller.model.PurchaseHistory;
import com.darshantandel.bookseller.repository.projection.IPurchaseItem;

import java.util.List;

public interface IPurchaseHistoryService {
    PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory);

    List<IPurchaseItem> findIPurchaseItemOfUser(Long userId);
}
