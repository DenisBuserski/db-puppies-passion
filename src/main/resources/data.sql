-- Add categories
INSERT INTO categories(id, name, url) VALUES (1, 'Bags','static/images/categories/dog-beds.jpg');
INSERT INTO categories(id, name, url) VALUES (2, 'Beds', '');
INSERT INTO categories(id, name, url) VALUES (3, 'Bowls', '');
INSERT INTO categories(id, name, url) VALUES (4, 'Clothes', '');
INSERT INTO categories(id, name, url) VALUES (5, 'Combs', '');
INSERT INTO categories(id, name, url) VALUES (6, 'Jewelry', '');
INSERT INTO categories(id, name, url) VALUES (7, 'Leashes', '');
INSERT INTO categories(id, name, url) VALUES (8, 'Toys', '');

-- Add user roles
INSERT INTO user_roles(id, user_role) VALUES (1, 'ADMIN');
INSERT INTO user_roles(id, user_role) VALUES (2, 'MODERATOR');
INSERT INTO user_roles(id, user_role) VALUES (3, 'CLIENT');

