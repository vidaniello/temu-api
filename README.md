# Temu API integration

Varius inferences to TEMU partner progmam API portal.

## Connection Parameters

The library requires the following parameters to connect to the Temu API:
- **Access Token**: The access token for authentication.
- **App Key**: The application key.
- **App Secret**: The application secret.
- **Endpoint Area**: The region for the API endpoint. Supported values are `US`, `EU`, and `GLOBAL`.

### Loading Strategy

Connection parameters are loaded by the `TemuPropertyReader` singleton using a two-step strategy:

1. **Environment Variables**: Initially, parameters are read from the following environment variables:
   - `TEMU_ACCESS_TOKEN`
   - `TEMU_APPKEY`
   - `TEMU_APP_SECRET`
   - `TEMU_ENDPOINT_AEREA` (Note: the environment variable name uses "AEREA")
   - `TEMU_SHOP_ID` the related shop id

2. **Properties File**: Subsequently, the library looks for a properties file to potentially override or fallback to the environment variables.
   - The default file location is `<user.home>/temu.properties`.
   - You can customize the file path and name using the environment variables:
     - `TEMU_PROPERTIES_FILE_PATH` (defaults to the Java user home directory)
     - `TEMU_PROPERTIES_FILE_NAME` (defaults to `temu.properties`)
   - Inside the properties file, you can use the same keys as the environment variables (`TEMU_ACCESS_TOKEN`, `TEMU_APPKEY`, `TEMU_APP_SECRET`, `TEMU_ENDPOINT_AEREA`).
   - If a property is defined in the file, it takes precedence over the environment variable. If it's missing in the file, the environment variable value is used as a fallback.

### Endpoints

Based on the `TEMU_ENDPOINT_AEREA` parameter, the library selects the appropriate endpoint URL:
- `US`: `https://openapi-b-us.temu.com/openapi/router`
- `EU`: `https://openapi-b-eu.temu.com/openapi/router`
- `GLOBAL`: `https://openapi-b-global.temu.com/openapi/router`