### Account creation happy path
1. Send `POST /api/v1/account/create` with no body
2. Expect HTTP `201`.
3. Save the returned account ID.
4. Send `GET /accounts`.
5. Expect HTTP `200` and verify that this ID is in the list.