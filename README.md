# Book Seller (Spring Boot)

### Sign Up

```
POST /api/authentication/sign-up HTTP/1.1
Host: localhost:8080
Content-Type: application/json
{
    "name": "user",
    "username": "user",
    "password": "user"
}
```

### Sign In

```
POST /api/authentication/sign-in HTTP/1.1
Host: localhost:8080
Content-Type: application/json
{
    "username": "user",
    "password": "user"
}
```

### Make Admin

```
PUT /api/internal/make-admin/admin HTTP/1.1
Host: localhost:8080
Authorization: Bearer InternalApiKey
```

### Get All Books

```
GET /api/book HTTP/1.1
Host: localhost:8080
```

### Save Book

```
POST /api/book HTTP/1.1
Host: localhost:8080
Authorization: Bearer admin-token
Content-Type: application/json
{
    "title": "Book Name",
    "description": "Book Description",
    "author": "Book Author",
    "price": 101
}
```

### Delete Book

```
DELETE /api/book/bookId HTTP/1.1
Host: localhost:8080
Authorization: Bearer admin-token
```

### Get All Purchase History Of User

```
GET /api/purchase-history HTTP/1.1
Host: localhost:8080
Authorization: Bearer token
```

### Save Purchase History

```
POST /api/purchase-history HTTP/1.1
Host: localhost:8080
Authorization: Bearer token
Content-Type: application/json
{
    "userId": "1",
    "bookId": "1",
    "price": "101"
}
```