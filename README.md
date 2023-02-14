# Variables-Expansion

**Placeholder:**
- `%variables_<variable>%`

Will parse placeholders before returning value

Example:
`%variables_1%` will return `Hello` based on the config below


Example setup in PlaceholderAPI config:

```
expansions:
  variables:
    '1': 'Hello'
```